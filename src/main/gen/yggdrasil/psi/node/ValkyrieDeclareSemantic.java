// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValkyrieDeclareSemantic extends PsiElement {

    @NotNull
    List<ValkyrieAttribute> getAttributeList();

    @Nullable
    ValkyrieDefaultValue getDefaultValue();

    @NotNull
    ValkyrieIdentifierFree getIdentifierFree();

}
