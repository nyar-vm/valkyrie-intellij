// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.github.valkyrie.language.mixin.MixinNamepath;
import com.github.valkyrie.language.psi_node.ValkyrieIdentifierNode;

public interface ValkyrieDefineStatement extends PsiElement {

  @Nullable
  ValkyrieDefineBlock getDefineBlock();

  @Nullable
  ValkyrieDefineTuple getDefineTuple();

  @Nullable
  ValkyrieEffectExpression getEffectExpression();

  @Nullable
  ValkyrieGenericDefine getGenericDefine();

  @NotNull
  ValkyrieModified getModified();

  @Nullable
  ValkyrieTypeExpression getTypeExpression();

  @NotNull
  MixinNamepath getNamepath();

  @NotNull
  ValkyrieIdentifierNode[] getModifiers();

}
