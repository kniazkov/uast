/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.uast.uast.base.Builder;
import org.uast.uast.base.ChildDescriptor;
import org.uast.uast.base.ChildrenMapper;
import org.uast.uast.base.EmptyFragment;
import org.uast.uast.base.Fragment;
import org.uast.uast.base.ListUtils;
import org.uast.uast.base.Node;
import org.uast.uast.base.Type;
import org.uast.uast.generated.tree.green.BlockStatement;
import org.uast.uast.generated.tree.green.Expression;

/**
 * Node that describes the 'Synchronized' type.
 *
 * @since 1.0
 */
public final class Synchronized implements Statement {
    /**
     * The type.
     */
    public static final Type TYPE = new TypeImpl();

    /**
     * The number of children.
     */
    private static final int CHILD_COUNT = 2;

    /**
     * The fragment associated with the node.
     */
    private Fragment fragment;

    /**
     * List of child nodes.
     */
    private List<Node> children;

    /**
     * Constructor.
     */
    private Synchronized() {
    }

    @Override
    public Type getType() {
        return Synchronized.TYPE;
    }

    @Override
    public Fragment getFragment() {
        return this.fragment;
    }

    @Override
    public String getData() {
        return "";
    }

    @Override
    public int getChildCount() {
        return Synchronized.CHILD_COUNT;
    }

    @Override
    public Node getChild(final int index) {
        return this.children.get(index);
    }

    /**
     * Type descriptor of the 'Synchronized' node.
     *
     * @since 1.0
     */
    private static class TypeImpl implements Type {
        /**
         * The 'Synchronized' string.
         */
        private static final String SYNCHRONIZED = "Synchronized";

        /**
         * The 'Expression' string.
         */
        private static final String EXPRESSION = "Expression";

        /**
         * The 'BlockStatement' string.
         */
        private static final String BLOCK_STATEMENT = "BlockStatement";

        /**
         * The list of child types.
         */
        private static final List<ChildDescriptor> CHILDREN =
            Collections.unmodifiableList(
                Arrays.asList(
                    new ChildDescriptor(
                        TypeImpl.EXPRESSION,
                        false
                    ),
                    new ChildDescriptor(
                        TypeImpl.BLOCK_STATEMENT,
                        false
                    )
                )
            );

        /**
         * The 'Statement' string.
         */
        private static final String STATEMENT = "Statement";

        /**
         * Hierarchy.
         */
        private static final List<String> HIERARCHY =
            Collections.unmodifiableList(
                Arrays.asList(
                    TypeImpl.SYNCHRONIZED,
                    TypeImpl.STATEMENT,
                    TypeImpl.STATEMENT
                )
            );

        /**
         * Properties.
         */
        private static final Map<String, String> PROPERTIES = Stream.of(
            new String[][] {
                {"color", "red"},
                {"language", "java"},
            }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        @Override
        public String getName() {
            return TypeImpl.SYNCHRONIZED;
        }

        @Override
        public List<ChildDescriptor> getChildTypes() {
            return TypeImpl.CHILDREN;
        }

        @Override
        public List<String> getHierarchy() {
            return TypeImpl.HIERARCHY;
        }

        @Override
        public String getProperty(final String name) {
            return TypeImpl.PROPERTIES.getOrDefault(name, "");
        }

        @Override
        public Builder createBuilder() {
            return new Constructor();
        }
    }

    /**
     * Class for 'Synchronized' node construction.
     *
     * @since 1.0
     */
    public static final class Constructor implements Builder {
        /**
         * The fragment associated with the node.
         */
        private Fragment fragment = EmptyFragment.INSTANCE;

        /**
         * Node 0.
         */
        private Expression first;

        /**
         * Node 1.
         */
        private BlockStatement second;

        @Override
        public void setFragment(final Fragment obj) {
            this.fragment = obj;
        }

        @Override
        public boolean setData(final String str) {
            return str.isEmpty();
        }

        @Override
        public boolean setChildrenList(final List<Node> list) {
            final Node[] mapping = new Node[2];
            final ChildrenMapper mapper = new ChildrenMapper(Synchronized.TYPE.getChildTypes());
            final boolean result = mapper.map(mapping, list);
            if (result) {
                this.first = (Expression) mapping[0];
                this.second = (BlockStatement) mapping[1];
            }
            return result;
        }

        @Override
        public boolean isValid() {
            return this.first != null
                && this.second != null;
        }

        @Override
        public Synchronized createNode() {
            if (!this.isValid()) {
                throw new IllegalStateException();
            }
            final Synchronized node = new Synchronized();
            node.fragment = this.fragment;
            node.children = new ListUtils<Node>()
                .add(
                    this.first,
                    this.second
                )
                .make();
            return node;
        }
    }
}