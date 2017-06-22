
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Titov  alexeytitovwork@gmail.com
 * @sience  21.06.2017
 */
public abstract class  CompositeClass {
    
    
    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);
    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void addChildTag(CompositeClass htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void removeChildTag(CompositeClass htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public List<CompositeClass>getChildren(){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public abstract void generateDataTree();
}
