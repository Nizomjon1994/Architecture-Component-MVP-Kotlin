package com.nizzle94.mvp

/**
 * Created by Khajiev Nizomjon on 03/06/2018.
 */
abstract class BasePresenter<out V> {
    private var view: V? = null

    abstract fun disposeSubscriptions()

    fun getView(): V? = view

    @Suppress("UNCHECKED_CAST")
    open fun attachView(view: Any?) {
        this.view = view as V?
    }

    open fun detachView() {
        view = null
    }
}