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

package javafx.scene.input;

/**
Builder class for javafx.scene.input.Mnemonic
@see javafx.scene.input.Mnemonic
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class MnemonicBuilder<B extends javafx.scene.input.MnemonicBuilder<B>> implements javafx.util.Builder<javafx.scene.input.Mnemonic> {
    protected MnemonicBuilder() {
    }
    
    /** Creates a new instance of MnemonicBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.input.MnemonicBuilder<?> create() {
        return new javafx.scene.input.MnemonicBuilder();
    }
    
    private javafx.scene.input.KeyCombination keyCombination;
    /**
    Set the value of the {@link javafx.scene.input.Mnemonic#getKeyCombination() keyCombination} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B keyCombination(javafx.scene.input.KeyCombination x) {
        this.keyCombination = x;
        return (B) this;
    }
    
    private javafx.scene.Node node;
    /**
    Set the value of the {@link javafx.scene.input.Mnemonic#getNode() node} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B node(javafx.scene.Node x) {
        this.node = x;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.input.Mnemonic} based on the properties set on this builder.
    */
    public javafx.scene.input.Mnemonic build() {
        javafx.scene.input.Mnemonic x = new javafx.scene.input.Mnemonic(this.node, this.keyCombination);
        return x;
    }
}
