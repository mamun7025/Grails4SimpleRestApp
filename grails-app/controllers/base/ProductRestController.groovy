package base

import grails.rest.RestfulController

class ProductRestController extends RestfulController{

    ProductService productService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static responseFormats = ['json', 'xml']

    ProductRestController(){
        super(Product)
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond productService.list(params), model:[productCount: productService.count()]
    }


    def getProduct(){

        respond productService.list(params), model:[productCount: productService.count()]

    }


}
