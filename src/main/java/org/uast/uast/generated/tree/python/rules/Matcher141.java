/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.python.rules;

import java.util.List;
import java.util.Map;
import org.uast.uast.base.Matcher;
import org.uast.uast.base.Node;

/**
 * Checks if the node matches some structure, and extracts the data and children.
 *
 * @since 1.0
 */
public final class Matcher141 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher141();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "arguments";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 1;

    /**
     * Constructor.
     */
    private Matcher141() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        return node.belongsToGroup(Matcher141.EXPECTED_TYPE)
            && node.getChildCount() == Matcher141.EXPECTED_COUNT
            && Matcher142.INSTANCE.match(node.getChild(0), children, data);
    }
}