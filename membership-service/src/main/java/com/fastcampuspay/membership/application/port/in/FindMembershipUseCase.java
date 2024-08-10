package com.fastcampuspay.membership.application.port.in;

import com.fastcampuspay.common.UseCase;
import com.fastcampuspay.membership.domain.Membership;

@UseCase
public interface FindMembershipUseCase {

    Membership findMembership(FindMembershipCommand command);

}
