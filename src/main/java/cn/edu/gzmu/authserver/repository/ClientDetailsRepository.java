package cn.edu.gzmu.authserver.repository;


import cn.edu.gzmu.authserver.base.BaseRepository;
import cn.edu.gzmu.authserver.model.entity.ClientDetails;

import java.util.Optional;

/**
 * Semester Repository
 *
 * @author echo
 * @version 1.0
 * @date 2019-5-23 17:38:13
 */
public interface ClientDetailsRepository extends BaseRepository<ClientDetails, Long> {

    /**
     * 通过 client id 查询
     *
     * @param clientId client id
     * @return ClientDetails
     */
    Optional<ClientDetails> findFirstByClientId(String clientId);

}