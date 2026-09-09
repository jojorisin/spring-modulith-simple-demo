package se.jensen.johanna.modularmonolithdemo.catalog.service;

import org.springframework.stereotype.Service;
import se.jensen.johanna.modularmonolithdemo.catalog.api.CatalogService;

@Service
class CatalogServiceImpl implements CatalogService {

  @Override
  public String getCatalog(int serviceId) {
    // hämta katalog / tjänsten från repo
    return "Här har du din katalogtjänst!";
  }


}
