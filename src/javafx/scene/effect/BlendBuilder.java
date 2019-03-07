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

package javafx.scene.effect;

/**
Builder class for javafx.scene.effect.Blend
@see javafx.scene.effect.Blend
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class BlendBuilder<B extends javafx.scene.effect.BlendBuilder<B>> implements javafx.util.Builder<javafx.scene.effect.Blend> {
    protected BlendBuilder() {
    }
    
    /** Creates a new instance of BlendBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.effect.BlendBuilder<?> create() {
        return new javafx.scene.effect.BlendBuilder();
    }
    
    private int __set;
    public void applyTo(javafx.scene.effect.Blend x) {
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setBottomInput(this.bottomInput);
        if ((set & (1 << 1)) != 0) x.setMode(this.mode);
        if ((set & (1 << 2)) != 0) x.setOpacity(this.opacity);
        if ((set & (1 << 3)) != 0) x.setTopInput(this.topInput);
    }
    
    private javafx.scene.effect.Effect bottomInput;
    /**
    Set the value of the {@link javafx.scene.effect.Blend#getBottomInput() bottomInput} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B bottomInput(javafx.scene.effect.Effect x) {
        this.bottomInput = x;
        __set |= 1 << 0;
        return (B) this;
    }
    
    private javafx.scene.effect.BlendMode mode;
    /**
    Set the value of the {@link javafx.scene.effect.Blend#getMode() mode} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B mode(javafx.scene.effect.BlendMode x) {
        this.mode = x;
        __set |= 1 << 1;
        return (B) this;
    }
    
    private double opacity;
    /**
    Set the value of the {@link javafx.scene.effect.Blend#getOpacity() opacity} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B opacity(double x) {
        this.opacity = x;
        __set |= 1 << 2;
        return (B) this;
    }
    
    private javafx.scene.effect.Effect topInput;
    /**
    Set the value of the {@link javafx.scene.effect.Blend#getTopInput() topInput} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B topInput(javafx.scene.effect.Effect x) {
        this.topInput = x;
        __set |= 1 << 3;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.effect.Blend} based on the properties set on this builder.
    */
    public javafx.scene.effect.Blend build() {
        javafx.scene.effect.Blend x = new javafx.scene.effect.Blend();
        applyTo(x);
        return x;
    }
}
