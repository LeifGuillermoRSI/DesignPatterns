The abstract factory pattern is for when you want to be able to create multiple
things that are related/similar, but have some variance, and those variances apply across multiple objects so that
you essentially have sets of objects that share the same variant that you'd like to produce depending on a given
circumstance.

The abstract factory pattern lets the client of the factory retrieve a set of objects
from a factory without having to worry about whether the objects will be "matching" objects.
i.e. the objects may have no differences due to the variances described earlier, and they
will belong together.

The client must choose the correct factory for their needs, but since all factories inherit from a single abstract
factory (actually an interface) the client can make the choice of any factory without breaking their code.