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

package javafx.stage;

/**
Builder class for javafx.stage.Popup
@see javafx.stage.Popup
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class PopupBuilder<B extends javafx.stage.PopupBuilder<B>> extends javafx.stage.PopupWindowBuilder<B> implements javafx.util.Builder<javafx.stage.Popup> {
    protected PopupBuilder() {
    }
    
    /** Creates a new instance of PopupBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.stage.PopupBuilder<?> create() {
        return new javafx.stage.PopupBuilder();
    }
    
    private boolean __set;
    public void applyTo(javafx.stage.Popup x) {
        super.applyTo(x);
        if (__set) x.getContent().addAll(this.content);
    }
    
    private java.util.Collection<? extends javafx.scene.Node> content;
    /**
    Add the given items to the List of items in the {@link javafx.stage.Popup#getContent() content} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B content(java.util.Collection<? extends javafx.scene.Node> x) {
        this.content = x;
        __set = true;
        return (B) this;
    }
    
    /**
    Add the given items to the List of items in the {@link javafx.stage.Popup#getContent() content} property for the instance constructed by this builder.
    */
    public B content(javafx.scene.Node... x) {
        return content(java.util.Arrays.asList(x));
    }
    
    /**
    Make an instance of {@link javafx.stage.Popup} based on the properties set on this builder.
    */
    public javafx.stage.Popup build() {
        javafx.stage.Popup x = new javafx.stage.Popup();
        applyTo(x);
        return x;
    }
}
