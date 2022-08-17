/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.java.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.uast.uast.base.Matcher;
import org.uast.uast.base.Node;

/**
 * Checks if the node matches some structure, and extracts the data and children.
 *
 * @since 1.0
 */
public final class Matcher231 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher231();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "ClassOrInterfaceDeclaration";

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 1;

    /**
     * The index of the first child.
     */
    private static final int FIRST_CHILD_ID = 0;

    /**
     * The number of the second hole.
     */
    private static final int SECOND_HOLE_ID = 2;

    /**
     * Constructor.
     */
    private Matcher231() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher231.EXPECTED_TYPE);
        if (result) {
            children.put(
                Matcher231.FIRST_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher231.FIRST_CHILD_ID))
            );
            final int count = node.getChildCount();
            final List<Node> list = new ArrayList<>(count - 1);
            for (int index = 1; index < count; index = index + 1) {
                list.add(node.getChild(index));
            }
            children.put(Matcher231.SECOND_HOLE_ID, list);
        }
        return result;
    }
}