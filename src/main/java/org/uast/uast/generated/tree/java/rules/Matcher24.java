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
public final class Matcher24 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher24();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "ClassOrInterfaceDeclaration";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 3;

    /**
     * Constructor.
     */
    private Matcher24() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher24.EXPECTED_TYPE)
            && node.getChildCount() == Matcher24.EXPECTED_COUNT
            && Matcher25.INSTANCE.match(node.getChild(0), children, data);
        if (result) {
            children.put(2, Collections.singletonList(node.getChild(1)));
            children.put(3, Collections.singletonList(node.getChild(2)));
        }
        return result;
    }
}
