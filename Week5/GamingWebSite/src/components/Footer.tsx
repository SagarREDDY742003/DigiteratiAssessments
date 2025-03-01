import { SimpleGrid, Box, Text, HStack, Icon } from "@chakra-ui/react"
import React from "react"
import { FaFacebook, FaTwitter, FaInstagram } from "react-icons/fa"

const Footer = () => {
  return (
    <SimpleGrid w='100%' minChildWidth='260px' p={6} gap={6} h={'200px'} backgroundColor={'gray.700'} color={'white'}>
      <Box>
        <Text fontSize='lg' fontWeight='bold'>Gamers Hub</Text>
        <Text>© 2025 Gaming Website. All rights reserved.</Text>
      </Box>
      <Box>
        <Text fontSize='lg' fontWeight='bold'>Links</Text>
        <Text color='teal.200'>Home</Text>
        <Text color='teal.200'>About</Text>
        <Text color='teal.200'>Contact</Text>
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
