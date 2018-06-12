package com.nizzle94.architecturecomponentmvp.ui.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.Unbinder
import com.nizzle94.architecturecomponentmvp.util.inflate

/**
 * Created by Khajiev Nizomjon on 12/06/2018.
 */
abstract class BaseFragment : Fragment() {

    @LayoutRes
    protected abstract fun getLayoutRes(): Int

    protected lateinit var unbinder: Unbinder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View? = container?.inflate(getLayoutRes())
        unbinder = ButterKnife.bind(this, view!!)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        unbinder.unbind()
    }
}