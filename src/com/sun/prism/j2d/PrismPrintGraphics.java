/*
 * Copyright (c) 2013, 2015, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.prism.j2d;

import com.sun.javafx.geom.Rectangle;
import com.sun.prism.PresentableState;
import com.sun.prism.PrinterGraphics;

public final class PrismPrintGraphics
    extends J2DPrismGraphics
    implements PrinterGraphics {

    static class PrintResourceFactory extends J2DResourceFactory {
        PrintResourceFactory() {
            super(null);
        }

        @Override
        J2DPrismGraphics createJ2DPrismGraphics(J2DPresentable target,
                                                java.awt.Graphics2D g2d) {
            J2DPrismGraphics pg = new PrismPrintGraphics(target, g2d);
            Rectangle cr = new Rectangle(0, 0, target.getContentWidth(),
                                         target.getContentHeight());
            pg.setClipRect(cr);
            return pg;
        }
    } 

    static class PagePresentable extends J2DPresentable {
        private int width;
        private int height;

        static J2DResourceFactory factory = new PrintResourceFactory();

        PagePresentable(int width, int height) {
            super(null, factory);
            this.width = width;
            this.height = height;
        }

        @Override
        public java.awt.image.BufferedImage createBuffer(int w, int h) {
            throw new UnsupportedOperationException("cannot create new buffers for image");
        }

        @Override
        public boolean lockResources(PresentableState pState) {
            return false;
        }

        public boolean prepare(Rectangle dirtyregion) {
            throw new UnsupportedOperationException("Cannot prepare an image");
        }

        public boolean present() {
            throw new UnsupportedOperationException("Cannot present on image");
        }

        public int getContentWidth() {
            return width;
        }

        public int getContentHeight() {
            return height;
        }

        private boolean opaque;
        public void setOpaque(boolean opaque) {
            this.opaque = opaque;
        }

        public boolean isOpaque() {
            return opaque;
        }
    }

    // The FX code thinks it can call setTransform() without
    // doing harm. Need to intercept all such calls and convert
    // them into a concatenation on the original/default transform.
    protected void setTransformG2D(java.awt.geom.AffineTransform tx) {
        g2d.setTransform(origTx2D);
        g2d.transform(tx);
    }

    // Because super() has to the first call, I need this function
    // to be called by the super-class constructor. This is all
    // just to have the by-product effect of grabbing the tx early.
    // I could make the caller of the constructor pass it, but it
    // really shouldn't have to be responsible for the necessity
    private java.awt.geom.AffineTransform origTx2D;
    protected void captureTransform(java.awt.Graphics2D g2d) {
        origTx2D = g2d.getTransform();
    }

    public PrismPrintGraphics(java.awt.Graphics2D g2d, int width, int height) {
        super(new PagePresentable(width, height), g2d);
        setClipRect(new Rectangle(0,0,width,height));
    }

    PrismPrintGraphics(J2DPresentable target, java.awt.Graphics2D g2d) {
        super(target, g2d);
    }
}
