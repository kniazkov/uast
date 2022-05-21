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
public final class Matcher21 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher21();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "MethodDeclaration";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 6;

    /**
     * Constructor.
     */
    private Matcher21() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher21.EXPECTED_TYPE)
            && node.getChildCount() == Matcher21.EXPECTED_COUNT
            && Matcher22.INSTANCE.match(node.getChild(0), children, data)
            && Matcher23.INSTANCE.match(node.getChild(1), children, data);
        if (result) {
            children.put(3, Collections.singletonList(node.getChild(2)));
            children.put(4, Collections.singletonList(node.getChild(3)));
            children.put(5, Collections.singletonList(node.getChild(4)));
            children.put(6, Collections.singletonList(node.getChild(5)));
        }
        return result;
    }
}
