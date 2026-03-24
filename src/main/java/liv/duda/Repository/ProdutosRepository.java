package liv.duda.Repository;

import liv.duda.Model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {

}