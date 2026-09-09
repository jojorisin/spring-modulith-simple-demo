package se.jensen.johanna.modularmonolithdemo.catalog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.jensen.johanna.modularmonolithdemo.catalog.api.CatalogService;

@Service
@RequiredArgsConstructor
class CatalogServiceImpl implements CatalogService {

  @Override
  public String getCatalog(int serviceId) {
    // hämta katalog / tjänsten från repo
    return "Här har du din katalogtjänst!";
  }


}
