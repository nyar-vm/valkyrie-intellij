// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValkyrieTypeStatement extends PsiElement {

  @Nullable
  ValkyrieAtom getAtom();

  @NotNull
  List<ValkyrieCallSuffix> getCallSuffixList();

  @NotNull
  ValkyrieIdentifier getIdentifier();

  @NotNull
  List<ValkyrieSlice> getSliceList();

  @NotNull
  List<ValkyrieTypeGeneric> getTypeGenericList();

}
