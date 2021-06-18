package grails4simplerestapp

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        // define your api path
        get "/api/getProduct"(controller:"ProductRest", action:"getProduct")
        get "/api/getProduct2"(controller:"ProductRest", action:"getProduct2")
        get "/api/getProduct3"(controller:"ProductRest", action:"getProduct3")

    }
}
