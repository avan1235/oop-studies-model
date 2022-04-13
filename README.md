# Studies system

Your task is to model the system that is capable of managing students and staff members
as a part of student system.

Students should have some programs assigned to them as well as personal information about their
studies' status.

Staff members can maintain some classes as well as have some set of publications that they've published.

As a part of this task you should:
- create your own class hierarchy from scratch for this problem (as we did on exercises)
- provide at least 2 examples of overriding in your class model:
  - the first using reference to `super` in its implementation
  - the second completely overriding parent's method (which may be `abstract`)
- have a look how Java `Map<String, Person>` work (and use probably `HashMap<String, Person>`) and use it in system
- have a look how Java `Set<Publication>` and use it in staff member
- work with `static` variables to generate identifiers for consecutive people in the world (you can assume that
  people get natural numbers in the order of their creation) - create `PersonFactory` class with only static methods
  that will be responsible for creating students and staff members
- play with your model in `Main` class a little and show how your implementation works
