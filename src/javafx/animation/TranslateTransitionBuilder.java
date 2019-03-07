/* 
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
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

package javafx.animation;

/**
Builder class for javafx.animation.TranslateTransition
@see javafx.animation.TranslateTransition
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public final class TranslateTransitionBuilder extends javafx.animation.TransitionBuilder<javafx.animation.TranslateTransitionBuilder> implements javafx.util.Builder<javafx.animation.TranslateTransition> {
    protected TranslateTransitionBuilder() {
    }
    
    /** Creates a new instance of TranslateTransitionBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.animation.TranslateTransitionBuilder create() {
        return new javafx.animation.TranslateTransitionBuilder();
    }
    
    private int __set;
    private void __set(int i) {
        __set |= 1 << i;
    }
    public void applyTo(javafx.animation.TranslateTransition x) {
        super.applyTo(x);
        int set = __set;
        while (set != 0) {
            int i = Integer.numberOfTrailingZeros(set);
            set &= ~(1 << i);
            switch (i) {
                case 0: x.setByX(this.byX); break;
                case 1: x.setByY(this.byY); break;
                case 2: x.setByZ(this.byZ); break;
                case 3: x.setDuration(this.duration); break;
                case 4: x.setFromX(this.fromX); break;
                case 5: x.setFromY(this.fromY); break;
                case 6: x.setFromZ(this.fromZ); break;
                case 7: x.setNode(this.node); break;
                case 8: x.setToX(this.toX); break;
                case 9: x.setToY(this.toY); break;
                case 10: x.setToZ(this.toZ); break;
            }
        }
    }
    
    private double byX;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getByX() byX} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder byX(double x) {
        this.byX = x;
        __set(0);
        return this;
    }
    
    private double byY;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getByY() byY} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder byY(double x) {
        this.byY = x;
        __set(1);
        return this;
    }
    
    private double byZ;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getByZ() byZ} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder byZ(double x) {
        this.byZ = x;
        __set(2);
        return this;
    }
    
    private javafx.util.Duration duration;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getDuration() duration} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder duration(javafx.util.Duration x) {
        this.duration = x;
        __set(3);
        return this;
    }
    
    private double fromX;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getFromX() fromX} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder fromX(double x) {
        this.fromX = x;
        __set(4);
        return this;
    }
    
    private double fromY;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getFromY() fromY} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder fromY(double x) {
        this.fromY = x;
        __set(5);
        return this;
    }
    
    private double fromZ;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getFromZ() fromZ} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder fromZ(double x) {
        this.fromZ = x;
        __set(6);
        return this;
    }
    
    private javafx.scene.Node node;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getNode() node} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder node(javafx.scene.Node x) {
        this.node = x;
        __set(7);
        return this;
    }
    
    private double toX;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getToX() toX} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder toX(double x) {
        this.toX = x;
        __set(8);
        return this;
    }
    
    private double toY;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getToY() toY} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder toY(double x) {
        this.toY = x;
        __set(9);
        return this;
    }
    
    private double toZ;
    /**
    Set the value of the {@link javafx.animation.TranslateTransition#getToZ() toZ} property for the instance constructed by this builder.
    */
    public javafx.animation.TranslateTransitionBuilder toZ(double x) {
        this.toZ = x;
        __set(10);
        return this;
    }
    
    /**
    Make an instance of {@link javafx.animation.TranslateTransition} based on the properties set on this builder.
    */
    public javafx.animation.TranslateTransition build() {
        javafx.animation.TranslateTransition x = new javafx.animation.TranslateTransition();
        applyTo(x);
        return x;
    }
}
