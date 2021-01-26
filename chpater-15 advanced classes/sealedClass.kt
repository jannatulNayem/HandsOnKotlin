sealed class Resource{
    class Success(var data: String): Resource()
    class Loading: Resource()
    class Error(var error: String): Resource()
}

// Advantages: All the three subclass share a same namespaces.