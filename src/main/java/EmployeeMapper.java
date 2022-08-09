import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeMapper {

    @Mappings({
            @Mapping(target="number", source="entity.id"),
            @Mapping(target="lastName", source="entity.lastName"),
            @Mapping(target="departmentDto", source="entity.department")
    })
    EmployeeDto entityToDto(Employee entity);

    @Mappings({
            @Mapping(target="id", source="dto.number"),
            @Mapping(target="lastName", source="dto.lastName"),
            @Mapping(target="department", source="dto.departmentDto")
    })
    Employee dtoToEntity(EmployeeDto dto);

}