package com.fastcampuspay.membership.adapter.in.web;

import com.fastcampuspay.membership.application.port.in.FindMembershipCommand;
import com.fastcampuspay.membership.application.port.in.FindMembershipUseCase;
import com.fastcampuspay.membership.domain.Membership;
import com.fastcampuspay.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@WebAdapter
@RequiredArgsConstructor
public class FindMembershipController {

    private final FindMembershipUseCase findMembershipUseCase;

    @GetMapping(path = "/membership/{membershipId}")
    ResponseEntity<Membership> findMembershipByMembershipId(@PathVariable String membershipId) {

        FindMembershipCommand command = FindMembershipCommand.builder()
            .membershipId(membershipId)
            .build();


        return ResponseEntity.ok(findMembershipUseCase.findMembership(command));
    }

}
