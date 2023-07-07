# Memento

## UML Diagram

The memento pattern is a software design pattern that exposes the private internal state of an object. One example of how this can be used is to restore an object to its previous state (undo via rollback), another is versioning, another is custom serialization.

![memento.png](img%2Fmemento.png)


## Python example

```python
"""
Memento pattern example.
"""


class Memento:
    def __init__(self, state) -> None:
        self._state = state

    def get_saved_state(self):
        return self._state


class Originator:
    _state = ""

    def set(self, state) -> None:
        print("Originator: Setting state to", state)
        self._state = state

    def save_to_memento(self) -> Memento:
        print("Originator: Saving to Memento.")
        return Memento(self._state)

    def restore_from_memento(self, memento) -> None:
        self._state = memento.get_saved_state()
        print("Originator: State after restoring from Memento:", self._state)


saved_states = []
originator = Originator()
originator.set("State1")
originator.set("State2")
saved_states.append(originator.save_to_memento())

originator.set("State3")
saved_states.append(originator.save_to_memento())

originator.set("State4")

originator.restore_from_memento(saved_states[1])

```