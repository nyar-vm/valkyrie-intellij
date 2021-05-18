// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.github.valkyrie.language.psi_node.ValkyrieIdentifierNode;

public interface ValkyrieTraitStatement extends PsiElement {

  @NotNull
  ValkyrieIdentifier getIdentifier();

  @Nullable
  ValkyrieMaybeModifier getMaybeModifier();

  @NotNull
  ValkyrieTraitBlock getTraitBlock();

  @Nullable
  ValkyrieTypeExpression getTypeExpression();

  @Nullable
  ValkyrieTypeGeneric getTypeGeneric();

  @NotNull
  ValkyrieIdentifierNode getKeyword();

  @NotNull
  ValkyrieIdentifierNode[] getModifiers();

}
