The abstract factory pattern is for when you want to be able to create multiple
things that are related/similar, but have some variance, and those variances apply across multiple objects so that
you essentially have sets of objects that share the same variant that you'd like to produce depending on a given
circumstance.

The abstract factory pattern lets the client of the factory retrieve a set of objects
from a factory without having to worry about whether the objects will be "matching" objects.
i.e. the objects may not have differences due to the variances described earlier, and they
will belong together.