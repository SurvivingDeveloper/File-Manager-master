// Generated code from Butter Knife. Do not modify!
package com.simplemobiletools.filemanager.fragments;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ItemsFragment$$ViewBinder<T extends ItemsFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558546, "field 'mListView'");
    target.mListView = finder.castView(view, 2131558546, "field 'mListView'");
    view = finder.findRequiredView(source, 2131558545, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = finder.castView(view, 2131558545, "field 'mSwipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558544, "field 'mCoordinatorLayout'");
    target.mCoordinatorLayout = finder.castView(view, 2131558544, "field 'mCoordinatorLayout'");
    view = finder.findRequiredView(source, 2131558547, "method 'fabClicked'");
    unbinder.view2131558547 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fabClicked(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ItemsFragment> implements Unbinder {
    private T target;

    View view2131558547;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.mListView = null;
      target.mSwipeRefreshLayout = null;
      target.mCoordinatorLayout = null;
      view2131558547.setOnClickListener(null);
    }
  }
}
