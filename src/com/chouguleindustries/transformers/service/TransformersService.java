package com.chouguleindustries.transformers.service;

import com.chouguleindustries.service.transformers.dto.TransformerDTO;

public interface TransformersService {

	boolean validateAndSave(TransformerDTO dto);
}
