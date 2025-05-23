package com.sha.translator_docs.service;


import com.sha.translator_docs.DTO.JobVacancyDTO.JobVacancyRequestDTO;
import com.sha.translator_docs.DTO.JobVacancyDTO.JobVacancyResponseDTO;
import com.sha.translator_docs.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface JobVacancyService {
    JobVacancyResponseDTO saveJobVacancy(JobVacancyRequestDTO dto, Long companyId);

    void deleteJobVacancy(Long jobVacancyId, Long companyId);

    Page<JobVacancyResponseDTO> findAllJobVacancy(int page, int size);

    Page<JobVacancyResponseDTO> findByCompanyPaginated(Long companyId, int page, int size);
}
