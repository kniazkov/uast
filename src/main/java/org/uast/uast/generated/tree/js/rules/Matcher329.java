/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.js.rules;

import java.util.List;
import java.util.Map;
import org.uast.uast.base.Matcher;
import org.uast.uast.base.Node;

/**
 * Checks if the node matches some structure, and extracts the data and children.
 *
 * @since 1.0
 */
public final class Matcher329 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher329();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "assignmentOperator";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 1;

    /**
     * Constructor.
     */
    private Matcher329() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        return node.belongsToGroup(Matcher329.EXPECTED_TYPE)
            && node.getChildCount() == Matcher329.EXPECTED_COUNT
            && Matcher330.INSTANCE.match(node.getChild(0), children, data);
    }
}