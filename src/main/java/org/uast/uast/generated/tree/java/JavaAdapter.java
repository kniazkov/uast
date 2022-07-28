/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.uast.uast.base.Adapter;
import org.uast.uast.base.Converter;
import org.uast.uast.generated.tree.java.rules.Rule0;
import org.uast.uast.generated.tree.java.rules.Rule1;
import org.uast.uast.generated.tree.java.rules.Rule10;
import org.uast.uast.generated.tree.java.rules.Rule11;
import org.uast.uast.generated.tree.java.rules.Rule12;
import org.uast.uast.generated.tree.java.rules.Rule13;
import org.uast.uast.generated.tree.java.rules.Rule14;
import org.uast.uast.generated.tree.java.rules.Rule15;
import org.uast.uast.generated.tree.java.rules.Rule16;
import org.uast.uast.generated.tree.java.rules.Rule17;
import org.uast.uast.generated.tree.java.rules.Rule18;
import org.uast.uast.generated.tree.java.rules.Rule19;
import org.uast.uast.generated.tree.java.rules.Rule2;
import org.uast.uast.generated.tree.java.rules.Rule20;
import org.uast.uast.generated.tree.java.rules.Rule21;
import org.uast.uast.generated.tree.java.rules.Rule22;
import org.uast.uast.generated.tree.java.rules.Rule23;
import org.uast.uast.generated.tree.java.rules.Rule24;
import org.uast.uast.generated.tree.java.rules.Rule25;
import org.uast.uast.generated.tree.java.rules.Rule26;
import org.uast.uast.generated.tree.java.rules.Rule27;
import org.uast.uast.generated.tree.java.rules.Rule28;
import org.uast.uast.generated.tree.java.rules.Rule29;
import org.uast.uast.generated.tree.java.rules.Rule3;
import org.uast.uast.generated.tree.java.rules.Rule30;
import org.uast.uast.generated.tree.java.rules.Rule31;
import org.uast.uast.generated.tree.java.rules.Rule32;
import org.uast.uast.generated.tree.java.rules.Rule33;
import org.uast.uast.generated.tree.java.rules.Rule34;
import org.uast.uast.generated.tree.java.rules.Rule35;
import org.uast.uast.generated.tree.java.rules.Rule36;
import org.uast.uast.generated.tree.java.rules.Rule37;
import org.uast.uast.generated.tree.java.rules.Rule38;
import org.uast.uast.generated.tree.java.rules.Rule39;
import org.uast.uast.generated.tree.java.rules.Rule4;
import org.uast.uast.generated.tree.java.rules.Rule40;
import org.uast.uast.generated.tree.java.rules.Rule41;
import org.uast.uast.generated.tree.java.rules.Rule5;
import org.uast.uast.generated.tree.java.rules.Rule6;
import org.uast.uast.generated.tree.java.rules.Rule7;
import org.uast.uast.generated.tree.java.rules.Rule8;
import org.uast.uast.generated.tree.java.rules.Rule9;

/**
 * Adapter that converts syntax trees, prepared by the parser of the Java language.
 *
 * @since 1.0
 */
public final class JavaAdapter extends Adapter {
    /**
     * The instance.
     */
    public static final Adapter INSTANCE = new JavaAdapter();

    /**
     * Constructor.
     */
    private JavaAdapter() {
        super(Collections.unmodifiableList(JavaAdapter.init()), JavaFactory.INSTANCE);
    }

    /**
     * Initializes the list of node converters.
     * @return The list of node converters
     */
    private static List<Converter> init() {
        return Arrays.asList(
            Rule0.INSTANCE,
            Rule1.INSTANCE,
            Rule2.INSTANCE,
            Rule3.INSTANCE,
            Rule4.INSTANCE,
            Rule5.INSTANCE,
            Rule6.INSTANCE,
            Rule7.INSTANCE,
            Rule8.INSTANCE,
            Rule9.INSTANCE,
            Rule10.INSTANCE,
            Rule11.INSTANCE,
            Rule12.INSTANCE,
            Rule13.INSTANCE,
            Rule14.INSTANCE,
            Rule15.INSTANCE,
            Rule16.INSTANCE,
            Rule17.INSTANCE,
            Rule18.INSTANCE,
            Rule19.INSTANCE,
            Rule20.INSTANCE,
            Rule21.INSTANCE,
            Rule22.INSTANCE,
            Rule23.INSTANCE,
            Rule24.INSTANCE,
            Rule25.INSTANCE,
            Rule26.INSTANCE,
            Rule27.INSTANCE,
            Rule28.INSTANCE,
            Rule29.INSTANCE,
            Rule30.INSTANCE,
            Rule31.INSTANCE,
            Rule32.INSTANCE,
            Rule33.INSTANCE,
            Rule34.INSTANCE,
            Rule35.INSTANCE,
            Rule36.INSTANCE,
            Rule37.INSTANCE,
            Rule38.INSTANCE,
            Rule39.INSTANCE,
            Rule40.INSTANCE,
            Rule41.INSTANCE
        );
    }
}
