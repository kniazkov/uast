/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2024 Ivan Kniazkov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.cqfn.uast.lang.green;

import java.util.Map;
import java.util.TreeMap;
import org.cqfn.astranaut.core.Node;
import org.cqfn.uast.codegen.BaseBlockGenerator;
import org.cqfn.uast.codegen.BaseLineGenerator;
import org.cqfn.uast.codegen.BlockGenerator;
import org.cqfn.uast.codegen.LineGenerator;
import org.cqfn.uast.codegen.Syntax;
import org.cqfn.uast.tree.green.ClassBody;
import org.cqfn.uast.tree.green.FieldDeclaration;
import org.cqfn.uast.tree.green.IntegerLiteral;
import org.cqfn.uast.tree.green.PrimitiveType;
import org.cqfn.uast.tree.green.Program;

/**
 * The class contains generators for some syntactic constructs that look the same
 * in different programming languages.
 *
 * @since 0.1
 */
public abstract class CommonSyntax extends Syntax {
    /**
     * Returns the separator that is used at the end of the previous language statement
     * to separate it from the next one.
     * @return Statement separator
     */
    public abstract String getStatementSeparator();

    /**
     * Initializes a collection of block generators for common cases.
     * @return Collection of line generators for different types of nodes.
     */
    protected Map<String, BaseBlockGenerator> initCommonBlockGenerators() {
        final Map<String, BaseBlockGenerator> gen = new TreeMap<>();
        gen.put(
            "Program",
            (BlockGenerator<Program>) (node, code, syntax) -> {
                for (final Node child : node.getChildrenList()) {
                    syntax.generateBlock(child, code);
                }
            }
        );
        gen.put(
            "ClassBody",
            (BlockGenerator<ClassBody>) (node, code, syntax) -> {
                for (final Node child : node.getChildrenList()) {
                    syntax.generateBlock(child, code);
                }
            }
        );
        gen.put(
            "FieldDeclaration",
            (BlockGenerator<FieldDeclaration>) (node, code, syntax) -> {
                final StringBuilder line = new StringBuilder();
                if (node.getDataType() != null) {
                    line.append(syntax.getCode(node.getDataType())).append(' ');
                }
                line.append(node.getName().getData());
                if (node.getInitValue() != null) {
                    line.append(" = ").append(syntax.getCode(node.getInitValue()));
                }
                line.append(this.getStatementSeparator());
                code.addLine(line.toString());
            }
        );
        return gen;
    }

    /**
     * Initializes a collection of line generators for common cases.
     * @return Collection of line generators for different types of nodes.
     */
    protected static Map<String, BaseLineGenerator> initCommonLineGenerators() {
        final Map<String, BaseLineGenerator> gen = new TreeMap<>();
        gen.put(
            "IntegerLiteral",
            (LineGenerator<IntegerLiteral>) (node, syntax) -> node.getData()
        );
        gen.put(
            "PrimitiveType",
            (LineGenerator<PrimitiveType>) (node, syntax) -> node.getData()
        );
        return gen;
    }
}