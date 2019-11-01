package com.silverfox.rest.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name = "cepService", url = "http://api.postmon.com.br")
@FeignClient(url="https://viacep.com.br/ws/", name = "cepService")
public interface CepService {
 
 @RequestMapping("/v1/cep/{cep}")
 CepResponse getCep(@PathVariable("cep") String cep);
}
