package ru.glabrion.base.view

import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import org.koin.android.ext.android.inject
import ru.glabrion.model.network.MainApiService
import ru.glabrion.model.prefs.PrefsService
import kotlin.coroutines.CoroutineContext

open class BaseFragment : Fragment(), CoroutineScope {

    val prefsService: PrefsService by inject()
    val mainApiService: MainApiService by inject()

    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main
}