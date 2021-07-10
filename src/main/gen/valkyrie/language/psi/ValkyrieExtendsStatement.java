// This is a generated file. Not intended for manual editing.
package valkyrie.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValkyrieExtendsStatement extends PsiElement {

  @Nullable
  ValkyrieClassBlock getClassBlock();

  @NotNull
  List<ValkyrieGenericCall> getGenericCallList();

  @Nullable
  ValkyrieModifiers getModifiers();

  @NotNull
  ValkyrieNamepath getNamepath();

  @Nullable
  ValkyrieTypeExpression getTypeExpression();

}
