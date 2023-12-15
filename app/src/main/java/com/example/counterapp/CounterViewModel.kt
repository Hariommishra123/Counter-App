package com.example.counterapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel()
{
    private val _repository: CounterRepository = CounterRepository()
    private var _count = mutableStateOf(_repository.getCounter().count)
    val count =_count

    fun increment()
    {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement()
    {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }
}
