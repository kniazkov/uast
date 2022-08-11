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
public final class Matcher229 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher229();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "suite";

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 3;

    /**
     * Constructor.
     */
    private Matcher229() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher229.EXPECTED_TYPE);
        if (result) {
            children.put(Matcher229.FIRST_HOLE_ID, node.getChildrenList());
        }
        return result;
    }
}
