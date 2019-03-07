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

package javafx.scene.control;

/**
Builder class for javafx.scene.control.TableColumn
@see javafx.scene.control.TableColumn
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class TableColumnBuilder<S, T, B extends javafx.scene.control.TableColumnBuilder<S, T, B>> implements javafx.util.Builder<javafx.scene.control.TableColumn<S, T>> {
    protected TableColumnBuilder() {
    }
    
    /** Creates a new instance of TableColumnBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <S, T> javafx.scene.control.TableColumnBuilder<S, T, ?> create() {
        return new javafx.scene.control.TableColumnBuilder();
    }
    
    private int __set;
    private void __set(int i) {
        __set |= 1 << i;
    }
    public void applyTo(javafx.scene.control.TableColumn<S, T> x) {
        int set = __set;
        while (set != 0) {
            int i = Integer.numberOfTrailingZeros(set);
            set &= ~(1 << i);
            switch (i) {
                case 0: x.setCellFactory(this.cellFactory); break;
                case 1: x.setCellValueFactory(this.cellValueFactory); break;
                case 2: x.getColumns().addAll(this.columns); break;
                case 3: x.setComparator(this.comparator); break;
                case 4: x.setContextMenu(this.contextMenu); break;
                case 5: x.setEditable(this.editable); break;
                case 6: x.setGraphic(this.graphic); break;
                case 7: x.setId(this.id); break;
                case 8: x.setMaxWidth(this.maxWidth); break;
                case 9: x.setMinWidth(this.minWidth); break;
                case 10: x.setOnEditCancel(this.onEditCancel); break;
                case 11: x.setOnEditCommit(this.onEditCommit); break;
                case 12: x.setOnEditStart(this.onEditStart); break;
                case 13: x.setPrefWidth(this.prefWidth); break;
                case 14: x.setResizable(this.resizable); break;
                case 15: x.setSortable(this.sortable); break;
                case 16: x.setSortNode(this.sortNode); break;
                case 17: x.setSortType(this.sortType); break;
                case 18: x.setStyle(this.style); break;
                case 19: x.getStyleClass().addAll(this.styleClass); break;
                case 20: x.setText(this.text); break;
                case 21: x.setUserData(this.userData); break;
                case 22: x.setVisible(this.visible); break;
            }
        }
    }
    
    private javafx.util.Callback<javafx.scene.control.TableColumn<S,T>,javafx.scene.control.TableCell<S,T>> cellFactory;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getCellFactory() cellFactory} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B cellFactory(javafx.util.Callback<javafx.scene.control.TableColumn<S,T>,javafx.scene.control.TableCell<S,T>> x) {
        this.cellFactory = x;
        __set(0);
        return (B) this;
    }
    
    private javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S,T>,javafx.beans.value.ObservableValue<T>> cellValueFactory;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getCellValueFactory() cellValueFactory} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B cellValueFactory(javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S,T>,javafx.beans.value.ObservableValue<T>> x) {
        this.cellValueFactory = x;
        __set(1);
        return (B) this;
    }
    
    private java.util.Collection<? extends javafx.scene.control.TableColumn<S,?>> columns;
    /**
    Add the given items to the List of items in the {@link javafx.scene.control.TableColumn#getColumns() columns} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B columns(java.util.Collection<? extends javafx.scene.control.TableColumn<S,?>> x) {
        this.columns = x;
        __set(2);
        return (B) this;
    }
    
    /**
    Add the given items to the List of items in the {@link javafx.scene.control.TableColumn#getColumns() columns} property for the instance constructed by this builder.
    */
    public B columns(javafx.scene.control.TableColumn<S,?>... x) {
        return columns(java.util.Arrays.asList(x));
    }
    
    private java.util.Comparator<T> comparator;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getComparator() comparator} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B comparator(java.util.Comparator<T> x) {
        this.comparator = x;
        __set(3);
        return (B) this;
    }
    
    private javafx.scene.control.ContextMenu contextMenu;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getContextMenu() contextMenu} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B contextMenu(javafx.scene.control.ContextMenu x) {
        this.contextMenu = x;
        __set(4);
        return (B) this;
    }
    
    private boolean editable;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#isEditable() editable} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B editable(boolean x) {
        this.editable = x;
        __set(5);
        return (B) this;
    }
    
    private javafx.scene.Node graphic;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getGraphic() graphic} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    @SuppressWarnings("unchecked")
    public B graphic(javafx.scene.Node x) {
        this.graphic = x;
        __set(6);
        return (B) this;
    }
    
    private java.lang.String id;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getId() id} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    @SuppressWarnings("unchecked")
    public B id(java.lang.String x) {
        this.id = x;
        __set(7);
        return (B) this;
    }
    
    private double maxWidth;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getMaxWidth() maxWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B maxWidth(double x) {
        this.maxWidth = x;
        __set(8);
        return (B) this;
    }
    
    private double minWidth;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getMinWidth() minWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B minWidth(double x) {
        this.minWidth = x;
        __set(9);
        return (B) this;
    }
    
    private javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S,T>> onEditCancel;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getOnEditCancel() onEditCancel} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B onEditCancel(javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S,T>> x) {
        this.onEditCancel = x;
        __set(10);
        return (B) this;
    }
    
    private javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S,T>> onEditCommit;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getOnEditCommit() onEditCommit} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B onEditCommit(javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S,T>> x) {
        this.onEditCommit = x;
        __set(11);
        return (B) this;
    }
    
    private javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S,T>> onEditStart;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getOnEditStart() onEditStart} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B onEditStart(javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S,T>> x) {
        this.onEditStart = x;
        __set(12);
        return (B) this;
    }
    
    private double prefWidth;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getPrefWidth() prefWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B prefWidth(double x) {
        this.prefWidth = x;
        __set(13);
        return (B) this;
    }
    
    private boolean resizable;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#isResizable() resizable} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B resizable(boolean x) {
        this.resizable = x;
        __set(14);
        return (B) this;
    }
    
    private boolean sortable;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#isSortable() sortable} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B sortable(boolean x) {
        this.sortable = x;
        __set(15);
        return (B) this;
    }
    
    private javafx.scene.Node sortNode;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getSortNode() sortNode} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    @SuppressWarnings("unchecked")
    public B sortNode(javafx.scene.Node x) {
        this.sortNode = x;
        __set(16);
        return (B) this;
    }
    
    private javafx.scene.control.TableColumn.SortType sortType;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getSortType() sortType} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B sortType(javafx.scene.control.TableColumn.SortType x) {
        this.sortType = x;
        __set(17);
        return (B) this;
    }
    
    private java.lang.String style;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getStyle() style} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    @SuppressWarnings("unchecked")
    public B style(java.lang.String x) {
        this.style = x;
        __set(18);
        return (B) this;
    }
    
    private java.util.Collection<? extends java.lang.String> styleClass;
    /**
    Add the given items to the List of items in the {@link javafx.scene.control.TableColumn#getStyleClass() styleClass} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    @SuppressWarnings("unchecked")
    public B styleClass(java.util.Collection<? extends java.lang.String> x) {
        this.styleClass = x;
        __set(19);
        return (B) this;
    }
    
    /**
    Add the given items to the List of items in the {@link javafx.scene.control.TableColumn#getStyleClass() styleClass} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    public B styleClass(java.lang.String... x) {
        return styleClass(java.util.Arrays.asList(x));
    }
    
    private java.lang.String text;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getText() text} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B text(java.lang.String x) {
        this.text = x;
        __set(20);
        return (B) this;
    }
    
    private java.lang.Object userData;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#getUserData() userData} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    @SuppressWarnings("unchecked")
    public B userData(java.lang.Object x) {
        this.userData = x;
        __set(21);
        return (B) this;
    }
    
    private boolean visible;
    /**
    Set the value of the {@link javafx.scene.control.TableColumn#isVisible() visible} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B visible(boolean x) {
        this.visible = x;
        __set(22);
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.control.TableColumn} based on the properties set on this builder.
    */
    public javafx.scene.control.TableColumn<S, T> build() {
        javafx.scene.control.TableColumn<S, T> x = new javafx.scene.control.TableColumn<S, T>();
        applyTo(x);
        return x;
    }
}
