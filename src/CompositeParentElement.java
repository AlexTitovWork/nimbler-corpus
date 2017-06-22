
import java.util.ArrayList;
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
public class CompositeParentElement extends CompositeClass  {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<CompositeClass>childrenTag;
    public CompositeParentElement(String tagName){
        this. tagName = tagName;
        this. startTag = "";
        this. endTag = "";
        this. childrenTag = new ArrayList<>();
    }
    @Override
    public String getTagName() {
        return tagName;
    }
    @Override
    public void setStartTag(String tag) {
        this. startTag = tag;
    }
    @Override
    public void setEndTag(String tag) {
        this. endTag = tag;
    }
    @Override
    public void addChildTag(CompositeClass htmlTag){
        childrenTag. add(htmlTag);
    }
    @Override
    public void removeChildTag(CompositeClass htmlTag){
        childrenTag. remove(htmlTag);
    }
    @Override
    public List<CompositeClass>getChildren(){
        return childrenTag;
    }
    @Override
    public void generateDataTree() {
        System. out. println(startTag);
        for(CompositeClass tag : childrenTag){
        tag.generateDataTree();
    }
        System. out. println(endTag);
    }
    
}
