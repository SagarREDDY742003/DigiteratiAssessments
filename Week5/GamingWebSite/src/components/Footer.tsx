import { SimpleGrid, Box, Text, HStack, Icon } from "@chakra-ui/react"
import React from "react"
import { FaFacebook, FaTwitter, FaInstagram } from "react-icons/fa"

const Footer = () => {
  return (
    <SimpleGrid justifyItems={'center'} w='100%' minChildWidth='260px' p={6} gap={6} minHeight={'105.5px'} backgroundColor={'gray.700'} color={'white'}>
      <Box>
        <Text fontSize='lg' fontWeight='bold'>Gamers Hub</Text>
        <Text>© 2025 Gaming Website. All rights reserved.</Text>
      </Box>
      <Box>
        <Text fontSize='lg' fontWeight='bold' px={'16'}>Links</Text>
        <Box display={'flex'}>
          <Text px={'2'}>Home</Text>
          <Text px={'2'}>About</Text>
          <Text px={'2'}>Contact</Text>
        </Box>
      </Box>
      <Box>
        <Text fontSize='lg' fontWeight='bold'>Follow Us</Text>
        <HStack spacing={4}>
          <Text>
            <Icon as={FaFacebook} w={6} h={6} />
          </Text>
          <Text>
            <Icon as={FaTwitter} w={6} h={6} />
          </Text>
          <Text>
            <Icon as={FaInstagram} w={6} h={6} />
          </Text>
        </HStack>
      </Box>
    </SimpleGrid>
  )
}

export default Footer
