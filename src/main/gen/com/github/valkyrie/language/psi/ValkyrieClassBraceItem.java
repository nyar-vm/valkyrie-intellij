// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValkyrieClassBraceItem extends PsiElement {

  @Nullable
  ValkyrieClassNumericKey getClassNumericKey();

  @Nullable
  ValkyrieExpression getExpression();

  @Nullable
  ValkyrieModifierSymbols getModifierSymbols();

  @NotNull
  ValkyrieTypeExpression getTypeExpression();

}
