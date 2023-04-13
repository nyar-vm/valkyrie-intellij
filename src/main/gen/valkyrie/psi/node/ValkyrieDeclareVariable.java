// This is a generated file. Not intended for manual editing.
package valkyrie.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValkyrieDeclareVariable extends PsiElement {

    @Nullable
    ValkyrieExpression getExpression();

    @Nullable
    ValkyrieForStatement getForStatement();

    @Nullable
    ValkyrieIfCaseStatement getIfCaseStatement();

    @Nullable
    ValkyrieIfStatement getIfStatement();

    @Nullable
    ValkyrieNewLambda getNewLambda();

    @Nullable
    ValkyrieNewObject getNewObject();

    @Nullable
    ValkyrieNewValue getNewValue();

    @Nullable
    ValkyriePatternBare getPatternBare();

    @Nullable
    ValkyrieTypeHint getTypeHint();

}
