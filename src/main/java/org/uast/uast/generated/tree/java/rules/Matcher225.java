/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.java.rules;

import java.util.List;
import java.util.Map;
import org.uast.uast.base.Matcher;
import org.uast.uast.base.Node;

/**
 * Checks if the node matches some structure, and extracts the data and children.
 *
 * @since 1.0
 */
public final class Matcher225 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher225();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "Modifier";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 0;

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 1;

    /**
     * Constructor.
     */
    private Matcher225() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher225.EXPECTED_TYPE)
            && node.getChildCount() == Matcher225.EXPECTED_COUNT;
        if (result) {
            data.put(Matcher225.FIRST_HOLE_ID, node.getData());
        }
        return result;
    }
}
