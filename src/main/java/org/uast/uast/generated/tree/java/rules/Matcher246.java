/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.java.rules;

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
public final class Matcher246 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher246();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "MethodDeclaration";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 4;

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 2;

    /**
     * The index of the first child.
     */
    private static final int FIRST_CHILD_ID = 1;

    /**
     * The number of the second hole.
     */
    private static final int SECOND_HOLE_ID = 3;

    /**
     * The index of the second child.
     */
    private static final int SECOND_CHILD_ID = 2;

    /**
     * The number of the third hole.
     */
    private static final int THIRD_HOLE_ID = 4;

    /**
     * The index of the third child.
     */
    private static final int THIRD_CHILD_ID = 3;

    /**
     * Constructor.
     */
    private Matcher246() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher246.EXPECTED_TYPE)
            && node.getChildCount() == Matcher246.EXPECTED_COUNT
            && Matcher247.INSTANCE.match(node.getChild(0), children, data);
        if (result) {
            children.put(
                Matcher246.FIRST_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher246.FIRST_CHILD_ID))
            );
            children.put(
                Matcher246.SECOND_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher246.SECOND_CHILD_ID))
            );
            children.put(
                Matcher246.THIRD_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher246.THIRD_CHILD_ID))
            );
        }
        return result;
    }
}
