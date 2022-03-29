/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.visualizer;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.uast.uast.base.DraftNode;
import org.uast.uast.base.EmptyTree;
import org.uast.uast.base.Node;
import org.uast.uast.utils.FilesReader;

/**
 * Test for {@link DotRender} class.
 *
 * @since 1.0
 */
public class DotRenderTest {
    /**
     * Directory with test resources.
     */
    private static final String DIR = "src/test/resources/visualizer/";

    /**
     * Test for a single node.
     *
     * @throws IOException If input stream cannot be read from a DOT file
     */
    @Test
    public void testSingleNode() throws IOException {
        final Node root = new DraftNode("SingleNode", "", new LinkedList<>());
        final String expected = new FilesReader(DIR.concat("testSingleNode.dot")).readAsString();
        final String result = this.renderDot(root);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test for a single node with data.
     *
     * @throws IOException If input stream cannot be read from a DOT file
     */
    @Test
    public void testSingleNodeWithData() throws IOException {
        final Node root = new DraftNode("Node", "data", new LinkedList<>());
        final String expected = new FilesReader(
            DotRenderTest.DIR.concat("testSingleNodeWithData.dot")
        ).readAsString();
        final String result = this.renderDot(root);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test for a node with children.
     * The tree depth is 2.
     *
     * @throws IOException If input stream cannot be read from a DOT file
     */
    @Test
    public void testNodeWithChildren() throws IOException {
        final List<Node> children = new LinkedList<>();
        children.add(new DraftNode("ChildNode0", "", new LinkedList<>()));
        children.add(new DraftNode("ChildNode1", "value", new LinkedList<>()));
        children.add(new DraftNode("ChildNode2", "", new LinkedList<>()));
        final Node root = new DraftNode("RootNode", "", children);
        final String expected = new FilesReader(
            DotRenderTest.DIR.concat("testNodeWithChildren.dot")
        ).readAsString();
        final String result = this.renderDot(root);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test for a node with children.
     * The tree depth is 4.
     *
     * @throws IOException If input stream cannot be read from a DOT file
     */
    @Test
    public void testNodeWithNestedChildren() throws IOException {
        final List<Node> thirdl = new LinkedList<>();
        thirdl.add(new DraftNode("Child4", "", new LinkedList<>()));
        final Node secondch = new DraftNode("Child2", "", thirdl);
        final List<Node> secondl = new LinkedList<>();
        secondl.add(secondch);
        secondl.add(new DraftNode("Child3", "", new LinkedList<>()));
        final Node firstch = new DraftNode("Child0", "", secondl);
        final List<Node> firstl = new LinkedList<>();
        firstl.add(firstch);
        firstl.add(new DraftNode("Child1", "", new LinkedList<>()));
        final Node root = new DraftNode("Root", "", firstl);
        final String expected = new FilesReader(
            DotRenderTest.DIR.concat("testNodeWithNestedChildren.dot")
        ).readAsString();
        final String result = this.renderDot(root);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test for a node that contain a null child node.
     *
     * @throws IOException If input stream cannot be read from a DOT file
     */
    @Test
    public void testNodeWithNullChild() throws IOException {
        final List<Node> children = new LinkedList<>();
        children.add(new DraftNode("Child", "", new LinkedList<>()));
        children.add(EmptyTree.INSTANCE);
        final Node root = new DraftNode("TestNode", "", children);
        final String expected = new FilesReader(
            DotRenderTest.DIR.concat("testNodeWithNullChild.dot")
        ).readAsString();
        final String result = this.renderDot(root);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Renders DOT text from a node.
     *
     * @param node A tree to be converted
     */
    private String renderDot(final Node node) {
        final DotRender render = new DotRender(node);
        return render.render();
    }
}
