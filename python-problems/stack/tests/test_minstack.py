from stack.minstack import MinStack


def test_minstack():
    minstack = MinStack()
    minstack.push(3)
    minstack.push(8)
    minstack.push(6)
    minstack.push(7)
    minstack.push(2)
    minstack.push(4)
    assert minstack.getMin() == 2
    minstack.pop()
    minstack.pop()
    assert minstack.getMin() == 3
