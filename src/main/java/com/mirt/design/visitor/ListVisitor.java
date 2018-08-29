package com.mirt.design.visitor;

import com.mirt.design.visitor.element.Directory;
import com.mirt.design.visitor.element.Entry;
import com.mirt.design.visitor.element.File;

import java.util.Iterator;

/**
 * visitor的子类，访问器的具体实现，作用是访问数据结构并显示元素一览
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class ListVisitor extends Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
