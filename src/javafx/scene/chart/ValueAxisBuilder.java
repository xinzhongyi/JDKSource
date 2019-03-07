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

package javafx.scene.chart;

/**
Builder class for javafx.scene.chart.ValueAxis
@see javafx.scene.chart.ValueAxis
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public abstract class ValueAxisBuilder<T extends java.lang.Number, B extends javafx.scene.chart.ValueAxisBuilder<T, B>> extends javafx.scene.chart.AxisBuilder<T, B> {
    protected ValueAxisBuilder() {
    }
    
    
    private int __set;
    public void applyTo(javafx.scene.chart.ValueAxis<T> x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setLowerBound(this.lowerBound);
        if ((set & (1 << 1)) != 0) x.setMinorTickCount(this.minorTickCount);
        if ((set & (1 << 2)) != 0) x.setMinorTickLength(this.minorTickLength);
        if ((set & (1 << 3)) != 0) x.setMinorTickVisible(this.minorTickVisible);
        if ((set & (1 << 4)) != 0) x.setTickLabelFormatter(this.tickLabelFormatter);
        if ((set & (1 << 5)) != 0) x.setUpperBound(this.upperBound);
    }
    
    private double lowerBound;
    /**
    Set the value of the {@link javafx.scene.chart.ValueAxis#getLowerBound() lowerBound} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B lowerBound(double x) {
        this.lowerBound = x;
        __set |= 1 << 0;
        return (B) this;
    }
    
    private int minorTickCount;
    /**
    Set the value of the {@link javafx.scene.chart.ValueAxis#getMinorTickCount() minorTickCount} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B minorTickCount(int x) {
        this.minorTickCount = x;
        __set |= 1 << 1;
        return (B) this;
    }
    
    private double minorTickLength;
    /**
    Set the value of the {@link javafx.scene.chart.ValueAxis#getMinorTickLength() minorTickLength} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B minorTickLength(double x) {
        this.minorTickLength = x;
        __set |= 1 << 2;
        return (B) this;
    }
    
    private boolean minorTickVisible;
    /**
    Set the value of the {@link javafx.scene.chart.ValueAxis#isMinorTickVisible() minorTickVisible} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B minorTickVisible(boolean x) {
        this.minorTickVisible = x;
        __set |= 1 << 3;
        return (B) this;
    }
    
    private javafx.util.StringConverter<T> tickLabelFormatter;
    /**
    Set the value of the {@link javafx.scene.chart.ValueAxis#getTickLabelFormatter() tickLabelFormatter} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B tickLabelFormatter(javafx.util.StringConverter<T> x) {
        this.tickLabelFormatter = x;
        __set |= 1 << 4;
        return (B) this;
    }
    
    private double upperBound;
    /**
    Set the value of the {@link javafx.scene.chart.ValueAxis#getUpperBound() upperBound} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B upperBound(double x) {
        this.upperBound = x;
        __set |= 1 << 5;
        return (B) this;
    }
    
}
