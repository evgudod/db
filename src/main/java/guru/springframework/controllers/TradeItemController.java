package guru.springframework.controllers;

import guru.springframework.domain.TradeItem;
import guru.springframework.services.TradeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class TradeItemController {

    /**
     * Created by YU on 4/18/18.
     */

        private TradeItemService tradeItemService;

        private TradeItemController productToProductForm;

        @Autowired
        public void setProductService(TradeItemService productService) {
            this.tradeItemService = productService;
        }

        @RequestMapping("/")
        public String redirToList(){
            return "redirect:/product/list";
        }

        @RequestMapping({"/product/list", "/product"})
        public String listProducts(Model model){
            model.addAttribute("products", tradeItemService.listAll());
            return "product/list";
        }

        @RequestMapping("/product/show/{id}")
        public String getProduct(@PathVariable String id, Model model){
            model.addAttribute("product", tradeItemService.getById(Long.valueOf(id)));
            return "product/show";
        }

        @RequestMapping("product/edit/{id}")
        public String edit(@PathVariable String id, Model model){
            TradeItem product = tradeItemService.getById(Long.valueOf(id));
            //ProductForm productForm = productToProductForm.convert(product);

            model.addAttribute("productForm", product);
            return "product/productform";
        }

        @RequestMapping(value="/product/new", method = RequestMethod.GET,produces = "application/json")
        public @ResponseBody String newProduct(Model model){
           // model.addAttribute("productForm", new ProductForm());
            return "{id:TEXT}";
        }

        /*
        @RequestMapping(value = "/product", method = RequestMethod.POST)
        public String saveOrUpdateProduct(@Valid ProductForm productForm, BindingResult bindingResult){

            if(bindingResult.hasErrors()){
                return "product/productform";
            }

            //Product savedProduct =.saveOrUpdateProductForm(productForm);

            //return "redirect:/product/show/" + savedProduct.getId();
            return null;
        }*/

        @RequestMapping("/product/delete/{id}")
        public String delete(@PathVariable String id){
            //productService.delete(Long.valueOf(id));
            return "redirect:/product/list";
        }
    }

