/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.python.rules;

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
public final class Matcher86 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher86();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "expr";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 2;

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 1;

    /**
     * The index of the first child.
     */
    private static final int FIRST_CHILD_ID = 1;

    /**
     * Constructor.
     */
    private Matcher86() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher86.EXPECTED_TYPE)
            && node.getChildCount() == Matcher86.EXPECTED_COUNT
            && Matcher87.INSTANCE.match(node.getChild(0), children, data);
        if (result) {
            children.put(
                Matcher86.FIRST_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher86.FIRST_CHILD_ID))
            );
        }
        return result;
    }
}
